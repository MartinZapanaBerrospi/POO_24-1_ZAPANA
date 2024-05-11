public class Tools {
    public boolean esCadenaNumerica(String cadena) {
        boolean sw = true;
        for (char c : cadena.toCharArray()) {
            if (!Character.isDigit(c)) {
                sw = false;
                break;
            }
        }
        return sw;
    }

    public boolean esCadenaAlfabetica(String cadena) {
        boolean sw = true;
        for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ' && c != 'ñ' && c != 'Ñ') {
                sw = false;
                break;
            }
        }
        return sw;
    }

    public boolean esNumeroEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validarId(String id) {
        return esCadenaNumerica(id) && id.length() <= 3;
    }

    public boolean validarNombresApellidos(String nombresApellidos) {
        return esCadenaAlfabetica(nombresApellidos) && nombresApellidos.length() <= 30;
    }

    public boolean validarLogin(String login) {
        return login.length() <= 10;
    }

    public boolean validarPassword(String password) {
        return password.length() <= 10;
    }

    public boolean validarEstado(String estado) {
        return esNumeroEntero(estado) && (estado.equals("0") || estado.equals("1"));
    }

    public boolean validarFechaIngreso(String fecha) {
        return fecha.length() == 8 && esCadenaNumerica(fecha);
    }
}
