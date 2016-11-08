/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import com.sun.deploy.uitoolkit.impl.fx.FXPreloader;
import gui.SymbolsMirk;
import gui.Map;
import javafx.scene.AccessibleAttribute;
import javafx.scene.control.Toggle;
import javax.accessibility.AccessibleState;

/**
 *
 * @author Trainerpl022
 */
public class Coins extends MapObject {
    TextColor.RGB foreColor = new RGB(165, 100, 61);
    TextColor.RGB bkgColor = new RGB(230, 230, 19);
   
    public Coins(char Sym) {
        
        super();
        setForegroundColor(foreColor);
       setBackgroundColor(bkgColor);
        setVisible(false);
        setWalkthrough(true);
        setSymbol(Sym);
        
    }
    
}
