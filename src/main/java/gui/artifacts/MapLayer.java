/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import gui.Map;

/**
 *
 * @author davidsanguinetti
 */
public abstract class MapLayer {
    
    protected MapObject[][] maplayer = new MapObject[Map.LINES][Map.COLUMNS];
    protected MapObject _theObject;
    
    public MapLayer(MapObject obj) {
        _theObject = obj;
    }

    public MapObject[][] getMaplayer() {
        return maplayer;
    }

    public void setMaplayer(MapObject[][] maplayer) {
        this.maplayer = maplayer;
    }

    public MapObject getTheObject() {
        return _theObject;
    }

    public void setTheObject(MapObject _theObject) {
        this._theObject = _theObject;
    }
    
    
    
}
