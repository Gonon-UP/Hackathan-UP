public class Display extends JFrame {
    private Tile tile;

    public Display() {
        // Load the image
        tile = Toolkit.getDefaultToolkit().getImage("HACKATHAN-UP/UP_Seal_Tiled/University_of_Portland_seal.png");

        setTitle("Display Image in JFrame");
        setSize(1200, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(tile, 0, 0, this);  // Draw image at coordinates (0, 0)
    }
}