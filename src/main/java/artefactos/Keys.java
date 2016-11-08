/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;
import gui.Map;

/**
 *
 * @author Trainerpl022
 */
public class Keys extends MapObject {
    TextColor.RGB foreColor = new RGB(230, 230, 19);
    TextColor.RGB bkgColor = new RGB(165, 100, 61);
    public Keys(char Sym) {
        super();
        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
        setWalkthrough(true);
        setVisible(false);
        setSymbol(Sym);
    }
    
}
