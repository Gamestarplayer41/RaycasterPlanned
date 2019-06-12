package Raycaster.Frames.Dimension2;

import Raycaster.Punkt.Punkt;
import Raycaster.Ray.Ray;
import Raycaster.Start.Manager;
import Raycaster.Start.Start;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Mauslistener implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {

        Start.manager.Player.setX(e.getX());
        Start.manager.Player.setY(e.getY()+1); //genauigkeit
        Start.manager.mover.mover(e.getX(),e.getY());
        Start.manager.frame2D.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
