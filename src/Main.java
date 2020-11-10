public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("map.txt",6,6);
        fileReader.parseFile();
        MazeRunner maze = new MazeRunner(fileReader.getMap(),fileReader.getStartPosCol(),fileReader.getStartPosRow());
        maze.findWayOut();
    }
}
