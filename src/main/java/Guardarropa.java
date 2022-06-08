import java.util.List;

public class Guardarropa {
  private Criterio criterio;
  private List<Prenda> prendas;
  private List<Usuario> usuarios;
  private List<Propuesta> propuestas;

  public void agregarPrenda(Prenda prenda) {
    //Si no es de mismo criterio, lanza exception
    this.prendas.add(prenda);
  }

  public void agregarUsuarioSecundario(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  public void agregarPropuestaPrenda(Propuesta propuesta) {
    this.propuestas.add(propuesta);
  }
}