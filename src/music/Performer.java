/*
 * Created on Oct 1, 2018
 *
 */
package music;

public class Performer extends Musician {
    
    protected String name;
    private boolean aliveAndKicking;
    protected int age;
    
    public Performer(String name, boolean aliveAndKicking, int age) {
        super();
        this.name = name;
        this.aliveAndKicking = aliveAndKicking;
        this.age = age;
    }

    public Performer(String name) {
        super();
        this.name = name;
        this.aliveAndKicking = true;
        this.age = 30;
    }

    public Performer() {
        super();
    }
    
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("I'm playing...");
    }

    public void play(Song song) {
//        System.out.print(this.name + " playing " + song.getTitle());
        System.out.println(this.name + ", playing \"" + song.getTitle() + "\"");
    }
    
    @Override
    public String toString() {
    	return "Performer: " + this.name + ", " + (this.aliveAndKicking ? "active" : "not active");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAliveAndKicking() {
        return aliveAndKicking;
    }

    public void setAliveAndKicking(boolean aliveAndKicking) {
        this.aliveAndKicking = aliveAndKicking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
