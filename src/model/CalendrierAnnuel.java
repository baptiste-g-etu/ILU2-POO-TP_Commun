package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12]; 
	
	public CalendrierAnnuel() {
		String[] nomMois = {"Janvier", "Février", "Mars", "Avril", 
				"Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Décembre"};
		int[] nbJ = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<12; ++i) {
			calendrier[i] = new Mois(nomMois[i], nbJ[i]);
		}
	}
	
	
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1);
	}
	
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois-1].reserver(jour-1);
			return true;
		}catch(IllegalStateException e) {
			e.getStackTrace();
			return false;
		}
	}
	
	private class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			for(int i=0; i<nbJours; ++i) {
				jours[i] = false;
			}
		}
		private boolean estLibre(int jour) {
			return !jours[jour];
		}
		private void reserver(int jour) {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Ce jour est déjà réservé !");
			}
			jours[jour] = true;
		}
	}
}
