package Unit02.homework.epum;


import Unit02.homework.epum.WritingTools.ColouredPen;
import Unit02.homework.epum.WritingTools.Paper;
import Unit02.homework.epum.WritingTools.Pen;
import Unit02.homework.epum.WritingTools.Pencil;

import java.util.ArrayList;

public class StarterPack {
    private ArrayList pack = new ArrayList();

    public StarterPack() {
        pack.add(new Pen(10).toString());
        pack.add(new ColouredPen(12,"red"));
        pack.add(new Pencil(8));
        pack.add(new Paper(25));
    }

    @Override
    public String toString() {
        String buffer="";
        for (int i=0; i< pack.size();i++) {
            buffer=buffer+pack.get(i).toString();
        }
        return buffer;
    }
}
