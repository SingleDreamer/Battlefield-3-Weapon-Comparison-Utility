package Battlefield3WeaponComparison;

import java.util.HashMap;

public class Battlefield3WeaponComparison {
	public static void main(String[] args) {
		//Weapons
		HashMap<String, Weapon> weapons = new HashMap<>(63, 1);
		weapons.put(".44 Magnum", new Weapon(".44 Magnum", 60, 30, 12, 50, 160, 460, 15, 2, 0.2, 0.2, 1, 4, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 1, 1, 1, 2, 1, 1, 0.3, 15, false, null, null, null, null, -1, -1, null));
		weapons.put("93R", new Weapon("93R", 20, 12.5, 8, 40, 900, 380, 7, 0.5, 0.2, 0.2, 1.5, 30, 0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 1.5, 1, 1, 2, 1.5, 1.5, 0.2, 15, false, null, null, null, null, -1, -1, null));
		weapons.put("A-91", new Weapon("A-91", 25, 14.3, 8, 50, 800, 420, 7, 0.2, 0.5, 0.5, 3, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 1.5, 1, 1, 2, 1.5, 1.5, 0.1, 15, false, null, new double[] {0.75, 1.33}, new double[] {-1, 0.8, 1.25}, new double[] {75, 560, 1.15, 0.25, 1.33}, 0.5, -1, new double[] {4, 35, 280, 0.9, 0.75, 1.67})); //Apparently, there's data for the A-91 bipod, despite being unavailable for use in-game.
		weapons.put("ACW-R", new Weapon("ACW-R", 20, 16.7, 8, 50, 850, 500, 7, 0.2, 0.1, 0.3, 2.5, 18, 0.3, 0.3, 0.3, 0.9, 0.9, 1, 2.25, 2, 1.5, 2.75, 2.5, 1.75, 0.1, 15, false, new double[] {0.25, 0.67, 0.5, 0.5}, new double[] {0.75, 1.23}, new double[] {-1, 0.67, 1.34}, new double[] {75, 650, 1.18, 0.35, 1.3}, 0.5, -1, new double[] {4, 35, 300, 0.85, 0.75, 1.34}));
		weapons.put("AEK-971", new Weapon("AEK-971", 25, 18.4, 8, 50, 900, 580, 7, 0.2, 0.5, 0.3, 3, 18, 0.3, 0.3, 0.3, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false, new double[] {0.25, 0.5, 0.25, 0.134}, new double[] {0.75, 1.2}, new double[] {-1, 0.75, 1.34}, new double[] {65, -1, 1.15, 0.25, 1.2}, 0.5, -1, new double[] {4, 35, 320, 0.9, 0.75, 1.4}));/*
		weapons.put("AK-74M", new Weapon("AK-74M", 25, 18.4, 8, 50, 650, 600, 7, 0.28, 0.2, 0.3, 1.5, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("AKS-74U", new Weapon("AKS-74U", 25, 14.3, 8, 50, 650, 440, 7, 0.28, 0.2, 0.3, 1.5, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("AN-94", new Weapon("AN-94", 25, 18.4, 8, 50, 600, 600, 7, 0.3, 0.2, 0.3, 1.5, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("AS Val", new Weapon("AS Val", 20, 18.4, 6, 40, 900, 333, 7, 0.4, 0.2, 0.3, 0.5, 18, 0, 0, 0, 1.5, 1.5, 1.5, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("AUG A3", new Weapon("AUG A3", 25, 18.4, 8, 50, 700, 670, 7, 0.2, 0.3, 0.4, 2.6, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("F2000", new Weapon("F2000", 25, 18.4, 8, 50, 850, 600, 7, 0.26, 0.5, 0.4, 3, 18, 0.4, 0.4, 0.4, 0.7, 0.7, 0.7, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("FAMAS", new Weapon("FAMAS", 25, 18.4, 8, 50, 1000, 630, 7, 0.35, 0.35, 0.55, 2.6, 18, 0.4, 0.4, 0.4, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("G17C", new Weapon("G17C", 25, 13.75, 12, 50, 400, 375, 7, 0.7, 0.1, 0.1, 1, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.5, 1.5, 0.2, 15, false));
		weapons.put("G18", new Weapon("G18", 20, 12.5, 8, 40, 900, 375, 7, 0.7, 0.4, 0.4, 2.4, 30, 0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 1.5, 1, 1, 2, 1.5, 1.5, 0.5, 15, false));
		weapons.put("G36C", new Weapon("G36C", 25, 14.3, 8, 50, 750, 500, 7, 0.28, 0.3, 0.3, 1.8, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("G3A3", new Weapon("G3A3", 34, 22, 8, 60, 550, 500, 10, 0.45, 0.2, 0.2, 1.4, 15, 0.1, 0.1, 0.1, 1.5, 1.5, 1.5, 3.5, 3, 2.5, 4, 3.5, 3, 0.12, 15, false));
		weapons.put("G53", new Weapon("G53", 25, 14.3, 8, 50, 750, 450, 7, 0.24, 0.2, 0.35, 2.5, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("JNG-90", new Weapon("JNG-90", 80, 59, 15, 100, 46.2, 560, 35, 2, 0, 0, 1.5, 15, 0, 0, 0, 1.5, 1, 1, 5, 4, 3, 6, 5, 4, 1.2, 15, true)); //Strangely, the JNG-90, a bolt-action sniper rifle, has a first shot multiplier of 1.5x. Every other single-shot weapon has a FSM of 1x.
		weapons.put("KH2002", new Weapon("KH2002", 25, 18.4, 8, 50, 800, 650, 7, 0.2, 0.4, 0.4, 1.5, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("L85A2", new Weapon("L85A2", 25, 18.4, 8, 50, 650, 600, 7, 0.2, 0.28, 0.28, 2.5, 18, 0.2, 0.2, 0.2, 0.7, 0.7, 0.7, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("L86A2", new Weapon("L86A2", 25, 18.4, 8, 50, 750, 640, 7, 0.32, 0.15, 0.25, 2, 13, 0.4, 0.4, 0.2, 1.5, 1, 1, 3, 3, 2.5, 4, 4, 3.5, 0.1, 15, false));
		weapons.put("L96", new Weapon("L96", 80, 59, 15, 100, 43.5, 540, 35, 2, 0, 0, 1, 15, 0, 0, 0, 1.5, 1, 1, 5, 4, 3, 6, 5, 4, 1.2, 15, true));
		weapons.put("LSAT", new Weapon("LSAT", 25, 18.4, 8, 50, 650, 620, 7, 0.4, 0.35, 0.35, 2.1, 15, 0.5, 0.4, 0.2, 1.5, 1.25, 1.25, 4, 3.25, 2.5, 5, 4.5, 3.5, 0.1, 15, false));
		weapons.put("M16A3", new Weapon("M16A3", 25, 18.4, 8, 50, 800, 650, 7, 0.26, 0.1, 0.4, 2.5, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("M16A4", new Weapon("M16A4", 25, 18.4, 8, 50, 800, 650, 7, 0.26, 0.075, 0.3, 2.5, 18, 0.1, 0.1, 0.1, 0.5, 0.5, 0.5, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("M1911", new Weapon("M1911", 34, 14.3, 12, 50, 333, 300, 7, 0.7, 0.1, 0.1, 1, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.5, 1.5, 0.2, 15, false));
		weapons.put("M240B", new Weapon("M240B", 34, 22, 8, 60, 650, 610, 10, 0.7, 0.5, 0.5, 1.7, 12, 0.5, 0.4, 0.2, 1.5, 1.5, 1.5, 5, 4, 3, 6, 5, 4, 0.12, 15, false));
		weapons.put("M249", new Weapon("M249", 25, 18.4, 8, 50, 800, 620, 7, 0.4, 0.4, 0.4, 2.2, 12, 0.5, 0.4, 0.2, 1.5, 1, 1, 5, 4, 3, 6, 5, 4, 0.1, 15, false));
		weapons.put("M27 IAR", new Weapon("M27 IAR", 25, 18.4, 8, 50, 750, 650, 7, 0.35, 0.1, 0.3, 2.2, 13, 0.4, 0.4, 0.2, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.1, 15, false));
		weapons.put("M39 EMR", new Weapon("M39 EMR", 50, 37.5, 15, 75, 300, 570, 20, 1.2, 0.2, 0.2, 1, 6, 0.0167, 0.0167, 0.0167, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.8, 15, true));
		weapons.put("M4", new Weapon("M4", 25, 14.3, 8, 50, 800, 580, 7, 0.26, 0.075, 0.2, 2.8, 18, 0.2, 0.2, 0.2, 0.4, 0.4, 0.4, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("M40A5", new Weapon("M40A5", 80, 59.5, 15, 100, 54.5, 490, 35, 2, 0, 0, 1, 15, 0, 0, 0, 1, 1, 1, 4, 3.5, 3, 5, 4.5, 4, 1.2, 15, true));
		weapons.put("M416", new Weapon("M416", 25, 18.4, 8, 50, 750, 600, 7, 0.26, 0.1, 0.3, 2, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("M417", new Weapon("M417", 50, 37.5, 15, 75, 295, 450, 20, 1.15, -0.05, 0.25, 1, 10, 0.05, 0.05, 0.05, 1.5, 1, 1, 3, 3, 2.5, 4.5, 4, 3.5, 0.55, 15, true));
		weapons.put("M4A1", new Weapon("M4A1", 25, 14.3, 8, 50, 800, 580, 7, 0.26, 0.1, 0.4, 2.8, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("M5K", new Weapon("M5K", 25, 13.75, 12, 50, 900, 380, 7, 0.25, 0.48, 0.48, 1.55, 30, 0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 1.2, 1.2, 1.2, 1.7, 1.5, 1.5, 0.1, 1.5, false));
		weapons.put("M60E4", new Weapon("M60E4", 34, 22, 8, 60, 580, 560, 10, 0.6, 0.2, 0.2, 1.5, 12, 0.5, 0.4, 0.2, 1.5, 1.5, 1.5, 5, 4, 3, 6, 5, 4, 0.12, 15, false));
		weapons.put("M9", new Weapon("M9", 25, 13.75, 12, 50, 400, 380, 7, 0.7, 0.1, 0.1, 1, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.5, 1.5, 0.2, 15, false));
		weapons.put("M98B", new Weapon("M98B", 95, 59, 15, 150, 46.2, 650, 35, 2, 0, 0, 1, 15, 0, 0, 0, 1.5, 1, 1, 5, 4, 3, 6, 5, 4, 1.2, 15, true));
		weapons.put("MG36", new Weapon("MG36", 25, 18.4, 8, 50, 750, 550, 7, 0.4, 0.1, 0.3, 1.8, 13, 0.4, 0.4, 0.4, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.1, 15, false));
		weapons.put("MK11 MOD 0", new Weapon("MK11 MOD 0", 50, 37.5, 15, 75, 260, 550, 20, 1.5, -0.1, 0.3, 1, 6, 0.0167, 0.0167, 0.0167, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.8, 15, true));
		weapons.put("MP412 REX", new Weapon("MP412 REX", 50, 28, 15, 37, 255, 370, 15, 1.2, 0.2, 0.2, 1, 10, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 1.25, 1, 1, 1.75, 1.5, 1.5, 0.3, 15, false));
		weapons.put("MP443", new Weapon("MP443", 25, 13.75, 12, 50, 400, 320, 7, 0.7, 0.1, 0.1, 1, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.5, 1.5, 0.2, 15, false)); 
		weapons.put("MP7", new Weapon("MP7", 20, 11.2, 12, 46, 950, 390, 7, 0.12, 0.45, 0.45, 2.2, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.25, 1.25, 0.06, 15, false));
		weapons.put("MTAR-21", new Weapon("MTAR-21", 25, 14.3, 8, 50, 900, 570, 7, 0.3, 0.25, 0.5, 2.5, 18, 0.5, 0.5, 0.5, 0.8, 0.8, 0.8, 1.5, 1, 1, 2, 1.5, 1.5, 0.1, 15, false));
		weapons.put("P90", new Weapon("P90", 20, 11.2, 12, 46, 900, 420, 7, 0.18, 0.4, 0.4, 2, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.25, 1.25, 0.06, 15, false));
		weapons.put("PDW-R", new Weapon("PDW-R", 25, 14.3, 8, 50, 750, 430, 7, 0.2, 0.2, 0.4, 2, 18, 0.4, 0.4, 0.4, 0.6, 0.6, 0.6, 1.5, 1, 1, 2, 1.5, 1.5, 0.1, 15, false));
		weapons.put("PKP Pecheneg", new Weapon("PKP Pecheneg", 34, 22, 8, 60, 600, 560, 10, 0.65, 0.4, 0.4, 1.5, 13, 0.5, 0.4, 0.2, 1.5, 1.5, 1.5, 5, 4, 3, 6, 5, 4, 0.12, 15, false));
		weapons.put("PP-19", new Weapon("PP-19", 16.7, 12.5, 12, 40, 900, 320, 7, 0.2, 0.3, 0.3, 1.5, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.25, 1.25, 0.06, 15, false));
		weapons.put("PP-2000", new Weapon("PP-2000", 25, 13.75, 12, 50, 650, 360, 7, 0.18, 0.3, 0.2, 2.5, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.25, 1.25, 0.06, 15, false));
		weapons.put("QBB-95", new Weapon("QBB-95", 25, 18.4, 8, 50, 650, 670, 7, 0.37, 0.3, 0.2, 2, 13, 0.4, 0.4, 0.2, 1, 0.7, 0.7, 3, 2.5, 2, 4, 3.5, 3, 0.1, 15, false));
		weapons.put("QBU-88", new Weapon("QBU-88", 50, 37.5, 15, 75, 260, 550, 20, 1.5, 0.3, 0.3, 1, 6, 0.025, 0.025, 0.025, 1, 1, 1, 3, 2.5, 2, 4, 3.5, 3, 0.8, 15, true));
		weapons.put("QBZ-95B", new Weapon("QBZ-95B", 25, 14.3, 8, 50, 650, 490, 7, 0.2, 0.3, 0.3, 2.5, 13, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 1.5, 1, 1, 2, 1.5, 1.5, 0.1, 15, false));
		weapons.put("RPK-74M", new Weapon("RPK-74M", 25, 18.4, 8, 50, 700, 600, 7, 0.3, 0.2, 0.2, 1.8, 13, 0.4, 0.2, 0.2, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.1, 15, false));
		weapons.put("SCAR-H", new Weapon("SCAR-H", 30, 20, 8, 50, 600, 420, 10, 0.5, 0.2, 0.2, 1.35, 13, 0.3, 0.3, 0.3, 1.2, 1.2, 1.2, 2.5, 2, 1.5, 3, 2.5, 2, 0.12, 15, false));
		weapons.put("SCAR-L", new Weapon("SCAR-L", 25, 18.4, 8, 50, 620, 580, 7, 0.2, 0.225, 0.225, 2.75, 18, 0.2, 0.2, 0.2, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.1, 15, false));
		weapons.put("SG553", new Weapon("SG553", 25, 14.3, 8, 50, 700, 430, 7, 0.25, 0.2, 0.4, 2.2, 18, 0.4, 0.4, 0.4, 0.8, 0.8, 0.8, 2, 1.5, 1, 2.5, 2, 1.5, 0.1, 15, false));
		weapons.put("SKS", new Weapon("SKS", 43, 27, 15, 60, 333, 440, 10, 0.55, 0.3, 0.4, 1, 15, 0.1, 0.1, 0.1, 1, 1, 1, 2.5, 2, 1.5, 3, 2.5, 2, 0.3, 15, true));
		weapons.put("SV-98", new Weapon("SV-98", 80, 50, 20, 80, 48, 520, 35, 2, 0, 0, 1, 15, 0, 0, 0, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 1.2, 15, true));
		weapons.put("SVD", new Weapon("SVD", 50, 37.5, 15, 75, 260, 530, 20, 1.5, -0.1, 0.3, 1, 6, 0.0167, 0.0167, 0.0167, 1.5, 1, 1, 3.5, 3, 2.5, 4.5, 4, 3.5, 0.8, 15, true));
		weapons.put("Type 88 LMG", new Weapon("Type 88 LMG", 25, 18.4, 8, 50, 650, 600, 7, 0.36, 0.3, 0.3, 1.5, 12, 0.5, 0.4, 0.2, 1.5, 1, 1, 5, 4, 3, 6, 5, 4, 0.1, 15, false));
		weapons.put("UMP45", new Weapon("UMP45", 34, 12.5, 8, 40, 600, 320, 7, 0.25, 0.2, 0.2, 2.75, 20, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1, 1, 1.5, 1.25, 1.25, 0.06, 15, false)); //Every weapon seems to have a spread decrease of 15.*/
		
		//
		Weapon weapon1 = weapons.get("M416");
		for (int i = 0; i <= 100; i++) {System.out.println(i + ": " + Round.roundToOnePlaceAndRemoveTrailingZero(weapon1.timeToKill(100, i)));}
		System.out.println();
		for (int i = (int) Math.ceil(100 / weapon1.MAX_DAMAGE); i <= Math.ceil(100 / weapon1.MIN_DAMAGE); i++) {System.out.println(i + ": " + Round.roundToOnePlaceAndRemoveTrailingZero(weapon1.hitKillDistance(100, i)));}
	}
}
