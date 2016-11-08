/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.sun.glass.ui.Cursor;
import static gui.Map.BRANCHESCOUNT;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;
import gui.SymbolsMirk;
import script.Orc;
import script.Spider;

/**
 *
 * @author Trainerpl022
 */
public class LayerTreasure extends MapLayer {
    
    private final int ORCS = 10;
    private final int SPIDERS = 3;
    
    public LayerTreasure() {
     
        generateSecretKey();
        generateCoins();
       
    }
    
	public void generateSecretKey() {
           
		this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Keys(SymbolsMirk.KEYS[0]);          
	}
        public void generateCoins() {
  
            for (int i = 0; i < 3; i++) {
                this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Coins(SymbolsMirk.KEYS[1]);
            }
		     
	}
}
