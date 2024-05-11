public class Establecimiento_Educacion extends Establecimiento {
    private int tipoEstablecimiento = 2;

    public Establecimiento_Educacion(int tipoEstablecimiento, int id, String razonSocial, long RUC, long telefono, int tipo, String ubiGeo) {
        super(id, razonSocial, RUC, telefono, tipo, ubiGeo);
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    // Getter y Setter para tipoEstablecimiento
    public int getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    public void setTipoEstablecimiento(int tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }
}