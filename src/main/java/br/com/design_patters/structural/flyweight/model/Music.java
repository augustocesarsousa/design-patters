package main.java.br.com.design_patters.structural.flyweight.model;

import main.java.br.com.design_patters.structural.flyweight.musicFlyweigth.MusicFlyweight;

public class Music {
	private MusicFlyweight musicFlyweight;
	private Integer playerQty;

	public Music(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
		this.playerQty = 0;
	}

	public void listenning() {
		playerQty++;
	}

	public MusicFlyweight getMusicFlyweight() {
		return musicFlyweight;
	}

	public void setMusicFlyweight(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
	}

	public Integer getPlayerQty() {
		return playerQty;
	}

	public void setPlayerQty(Integer playerQty) {
		this.playerQty = playerQty;
	}

	@Override
	public String toString() {
		return "Music [musicFlyweight=" + musicFlyweight + ", playerQty=" + playerQty + "]";
	}
}
