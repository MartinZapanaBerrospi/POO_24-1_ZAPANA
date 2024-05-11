public class Establecimiento_Salud extends Establecimiento {
    private int tipoEstablecimiento = 1;

    public Establecimiento_Salud(int tipoEstablecimiento, int id, String razonSocial, long RUC, long telefono, int tipo, String ubiGeo) {
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
