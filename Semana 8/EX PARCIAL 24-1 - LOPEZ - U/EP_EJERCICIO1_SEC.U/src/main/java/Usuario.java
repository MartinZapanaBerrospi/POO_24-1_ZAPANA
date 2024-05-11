public class Usuario {
    private int id;
    private String nombresApellidos;
    private String login;
    private String password;
    private int estado;
    private String fechaIngreso;

    public Usuario(int id, String nombresApellidos, String login, String password, int estado, String fechaIngreso) {
        this.id = id;
        this.nombresApellidos = nombresApellidos;
        this.login = login;
        this.password = password;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getEstado() {
        return estado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
