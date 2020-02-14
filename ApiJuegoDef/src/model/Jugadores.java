package model;
// Generated 14 feb. 2020 17:54:49 by Hibernate Tools 5.2.12.Final

/**
 * Jugadores generated by hbm2java
 */
public class Jugadores implements java.io.Serializable {

	private Integer idJugador;
	private String nickName;
	private String email;
	private String password;
	private Integer ganadas;
	private Integer empatadas;
	private Integer perdidas;

	public Jugadores() {
	}

	public Jugadores(String nickName, String email, String password, Integer ganadas, Integer empatadas,
			Integer perdidas) {
		this.nickName = nickName;
		this.email = email;
		this.password = password;
		this.ganadas = ganadas;
		this.empatadas = empatadas;
		this.perdidas = perdidas;
	}

	public Integer getIdJugador() {
		return this.idJugador;
	}

	public void setIdJugador(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGanadas() {
		return this.ganadas;
	}

	public void setGanadas(Integer ganadas) {
		this.ganadas = ganadas;
	}

	public Integer getEmpatadas() {
		return this.empatadas;
	}

	public void setEmpatadas(Integer empatadas) {
		this.empatadas = empatadas;
	}

	public Integer getPerdidas() {
		return this.perdidas;
	}

	public void setPerdidas(Integer perdidas) {
		this.perdidas = perdidas;
	}

}
