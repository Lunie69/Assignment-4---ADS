public class Vertex {

    private final int id;

    public Vertex(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Vertex other) {
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Vertex#" + id;
    }
}