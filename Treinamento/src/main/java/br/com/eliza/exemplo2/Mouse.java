package br.com.eliza.exemplo2;

public class Mouse {
	// criar campo , construtor de todos os campos ,getter e setter
	// óptico,laser,mecanico,óptico laser,infravermelho
	// logitech,multilaser,hp,DEll,intelbras,
	private String tipoMouse;
	private Marca marcaMouse;
		
	public Mouse (String tipoMouse, Marca marcaMouse) {
		this.tipoMouse = tipoMouse;
		this.marcaMouse = marcaMouse;
	}
	
	public String getTipoMouse() {
		return this.tipoMouse;
	}

	public void setTipoMouse(Marca marcaMouse) {
		this.marcaMouse = marcaMouse;
	}
	public Marca getMarcaMouse() {
		return this.marcaMouse;
	}
	public void setMarcaMouse(Marca marcaMouse) {
		this.marcaMouse = marcaMouse;
	}
}
