import java.util.List;

public class AgregarPrenda implements Propuesta{
  private Prenda prenda;
  private Boolean activo = true;

  @Override
  public void accion(List<Prenda> prendaList) {
    prendaList.add(prenda);
  }

  @Override
  public void cambiarEstado() {
    activo = !activo;
  }
}
