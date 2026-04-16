package model;

public class ReservationHotel extends Reservation {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numeroChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int numeroChambre) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.numeroChambre = numeroChambre;
	}
	
	
	@Override
	public String toString() {
		return String.format("Le %d/%d: chambre n°%d avec %d lit(s) simple(s) et %d lit(s) double(s)", 
				super.jour, super.mois, nbLitsSimples, nbLitsDoubles, numeroChambre);
	}
}
