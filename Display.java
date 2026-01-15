public class Display extends JFrame {
    private Tile tile;

    public Display() {
        // Load the image
        tile = Toolkit.getDefaultToolkit().getImage("path/to/your/image.jpg");

        setTitle("Display Image in JFrame");
        setSize(1200, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 0, 0, this);  // Draw image at coordinates (0, 0)
    }

    public static void main(String[] args) {
        new ImageInJFrameExample();
    }

}