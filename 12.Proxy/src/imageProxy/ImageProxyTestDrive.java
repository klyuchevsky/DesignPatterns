package imageProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Ambient: Music for Airports", "http://ecx.images-amazon.com/images/I/51C19Sc2SmL._SL500_AA280_.jpg");
        cds.put("Buddha Bar", "http://ecx.images-amazon.com/images/I/41P8V70PCEL.jpg");
        cds.put("Ima", "http://ecx.images-amazon.com/images/I/513dTiH0T0L._SL500_AA300_.jpg");
        cds.put("Karma", "http://ecx.images-amazon.com/images/I/412Rd6omkxL._BO2,204,203,200_PIsitb-sticker-arrow-click,TopRight,35,-76_AA278_PIkin4,BottomRight,-65,22_AA300_SH20_OU02_.jpg");
        cds.put("MCMXC A.D.", "http://g-ecx.images-amazon.com/images/G/01/ciu/01/9b/6503c060ada04e4e7a9da110.L._SY300_.jpg");
        cds.put("Northern Exposure", "http://ecx.images-amazon.com/images/I/516lleZqouL._SL500_AA300_.jpg");
        cds.put("Selected Ambient Works, Vol.2", "http://ecx.images-amazon.com/images/I/51t7TFUjDSL._SY300_.jpg");
        cds.put("oliver", "http://ecx.images-amazon.com/images/I/51KRd7OFgqL._SL500_AA280_.jpg");

        URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol.2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
