package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "player")
public class Player {
	
	@Id
	private long playerID;
	
	String nomPlayer = "ANÒNIM";
	Date dataRegistre;
	int percExit;
	int tirades;
	private int tiradesExit;
	
	public int getPercExit() {
		return percExit;
	}

	public void setPercExit(int tiradesExit) {
		this.tiradesExit += tiradesExit;
		
		this.tirades++;
		
		this.percExit = (int) ((float) ((float) this.tiradesExit / (float) tirades) * 100);
	}

	public Player() {
	}

	public Player(String nomPlayer, long playerID) {
		this.nomPlayer = nomPlayer;
		this.playerID = playerID;
		this.dataRegistre = new Date();
		this.tirades = 0;
		this.percExit = 0;
	}

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(long playerID) {
		this.playerID = playerID;
	}

	public String getNomPlayer() {
		return nomPlayer;
	}

	public void setNomPlayer(String nomPlayer) {
		this.nomPlayer = nomPlayer;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", nomPlayer=" + nomPlayer + ", dataRegistre=" + dataRegistre + "]";
	}

	
}
