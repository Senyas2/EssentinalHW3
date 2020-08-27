package Task1;

public class ClassRoom  {
    Pupil p1;
    Pupil p2;
    Pupil p3;
    Pupil p4;

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {

        this(p1, p2, p3, new Pupil());
    }

    public ClassRoom(Pupil p1, Pupil p2) {
        this(p1, p2, new Pupil(), new Pupil());
    }

    public void study() {
        p1.study();
        p2.study();
        p3.study();
        p4.study();
    }
}
