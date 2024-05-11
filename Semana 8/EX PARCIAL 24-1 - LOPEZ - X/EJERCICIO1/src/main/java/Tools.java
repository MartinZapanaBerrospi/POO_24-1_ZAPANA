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

    public boolean validarRazonSocial(String razonSocial) {
        return esCadenaAlfabetica(razonSocial) && razonSocial.length() <= 30;
    }

    public boolean validarRUC(String RUC) {
        return RUC.length() <= 11;
    }

    public boolean validarTelefono(String telefono) {
        return telefono.length() <= 9;
    }

    public boolean validarTipo(String tipo) {
        return esNumeroEntero(tipo) && (tipo.equals("1") || tipo.equals("2"));
    }

    public boolean validarUbiGeo(String UbiGeo) {
        return UbiGeo.length() == 6 && esCadenaNumerica(UbiGeo);
    }
}
