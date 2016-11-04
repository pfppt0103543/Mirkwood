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
public class Bridge extends MapObject {
    TextColor.RGB foreColor = new RGB(150, 150, 150);
    TextColor.RGB bkgColor = new RGB(100, 100, 100);
    public Bridge(char Sym) {
        super();
        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
        setWalkthrough(true);
        setSymbol(Sym);
    }
    
}
