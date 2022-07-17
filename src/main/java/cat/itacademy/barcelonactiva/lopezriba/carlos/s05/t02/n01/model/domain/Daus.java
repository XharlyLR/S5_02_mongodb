package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "daus")
public class Daus {

	@Id
	private long dausID;
	
	private int dau1;
	private int dau2;
	private Boolean guanyat;
	private long playerID;

	public Daus() { }
	
	public Daus(long playerID, long dausID) {
		this.dau1 = 1 + (int)(Math.random() * 6);
		this.dau2 = 1 + (int)(Math.random() * 6);
		this.playerID = playerID;
		this.dausID = dausID;

		if (this.dau1 + this.dau2 == 7)
			this.guanyat = true;
		else
			this.guanyat = false;
	}

	public long getDausID() {
		return dausID;
	}

	public void setDausID(long dausID) {
		this.dausID = dausID;
	}

	public int getDau1() {
		return dau1;
	}

	public void setDau1(int dau1) {
		this.dau1 = dau1;
	}

	public int getDau2() {
		return dau2;
	}

	public void setDau2(int dau2) {
		this.dau2 = dau2;
	}

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayer(long playerID) {
		this.playerID = playerID;
	}

	public boolean getExit() {
		return guanyat;
	}

	public void setExit(boolean exit) {
		this.guanyat = exit;
	}
	
	
}
