package entities;

public class UsersTest {
	private int id;
	private String name;
	private String observacao;
	private boolean sair;

	public UsersTest(int id, String name, String observacao) {
		this.id = id;
		this.name = name;
		this.observacao = observacao;
	}
	public UsersTest() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean getSair() {
		return sair;
	}

	public void sair(String sair) {
		if (sair.equals("sair")) {
			this.sair = true;
		}
		else {
			this.sair = false;
		}
	}
}
