/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.awt.Frame;

/**
 *
 * @author MacBookPro
 */
public class PanDateAlwaysOnTop extends PanDate.PanDate{
    
    public PanDateAlwaysOnTop(Frame parent, boolean modal) {
        super(parent, modal);
        this.setAlwaysOnTop(true);
    }
    
}
