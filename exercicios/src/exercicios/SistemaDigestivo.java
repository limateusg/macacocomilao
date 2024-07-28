package exercicios;

public class SistemaDigestivo {

	private String nome; 
	private String bucho[] = new String[4]; 
	private int indice; 
	
	public SistemaDigestivo(String nome) {
		this.nome = nome; 
	}
		
	public void comerMais(String novaComida) {
		if (indice < bucho.length) {
            bucho[indice] = novaComida;
            indice++;
		}
	}
	
	public  boolean estaSaciado() { 
		for (int i = 0; i < bucho.length; i ++) {
			if (bucho[i] == null) {
				return false; 
			}
		}
		return true; 
	}
	
	public String verBucho() {
		StringBuilder macacoComeu = new StringBuilder();
        for (int i = 0; i < bucho.length; i++) {
            if (bucho[i] != null) {
                if (i == bucho.length - 1) {
                    macacoComeu.append(" ").append(bucho[i]).append(".");
                } else if (i == bucho.length - 2) {
                    macacoComeu.append(" ").append(bucho[i]).append(" e");
                } else {
                    macacoComeu.append(" ").append(bucho[i]).append(",");
                }
            }
        }
        return macacoComeu.toString();
		}
	
	public String toString() {
		return "O macaco " + nome + " comeu: " + verBucho(); 
	}

}