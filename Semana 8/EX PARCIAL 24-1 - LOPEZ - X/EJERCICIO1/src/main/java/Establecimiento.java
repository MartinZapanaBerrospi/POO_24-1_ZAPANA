public class Establecimiento {
    private int id;
    private String razonSocial;
    private long RUC;
    private long telefono;
    private int tipo;
    private String ubiGeo;

    public Establecimiento(int id, String razonSocial, long RUC, long telefono, int tipo, String ubiGeo) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.RUC = RUC;
        this.telefono = telefono;
        this.tipo = tipo;
        this.ubiGeo = ubiGeo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setUbiGeo(String ubiGeo) {
        this.ubiGeo = ubiGeo;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public long getRUC() {
        return RUC;
    }

    public long getTelefono() {
        return telefono;
    }

    public int getTipo() {
        return tipo;
    }

    public String getUbiGeo() {
        return ubiGeo;
    }
}
