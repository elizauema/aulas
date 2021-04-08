package br.com.eliza.agencia;

public class Agencia {
	private int numAgencia;
	private String nomAgencia;
	
	public Agencia(int numAgencia, String nomAgencia) {
		this.numAgencia = numAgencia;
		this.nomAgencia = nomAgencia;
	}
	
	public int getNumAgencia() {
		return this.numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getNomAgencia() {
		return this.nomAgencia;
	}
	public void setNomAgencia(String nomAgencia) {
		this.nomAgencia = nomAgencia;
	}

	@Override
	public String toString() {
		return "Agencia [numAgencia=" + numAgencia + ", nomAgencia=" + nomAgencia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numAgencia;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		if (numAgencia != other.numAgencia)
			return false;
		return true;
	}
	
}
