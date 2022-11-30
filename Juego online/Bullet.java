class Bullet{
    private double angle;
    private double speed;
    private int damage;
    private int x;
    private int y;
    private char color;

    public Bullet(double angle,double speed,int damage,int x,int y,char color){
        this.angle=angle;
        this.speed=speed;
        damage=10;
        this.x=x;
        this.y=y;
        this.color=color;
    }
    public void move(double angle){
        if((angle>=0)&&(angle<90)){
            if(angle==0){
                x++;
            }else{
                x++;
                y--;
            }
        }
        else if((angle>=90)&&(angle<180)){
            if(angle==90){
                y--;
            }else{
                x--;
                y--;
            }
        }
        else if((angle>=180)&&(angle<270)){
            if(angle==180){
                x--;
            }else{
                x--;
                y++;
            }
        }
        else if((angle>=270)&&(angle<=360)){
            if(angle==270){
                y++;
            }else{
                x++;
                y++;
            }
            if(angle>=360){
                angle=0;
            }
        }
    }

    public double getAngle() {
        return angle;
    }
    public char getColor() {
        return color;
    }
    public int getDamage() {
        return damage;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double getSpeed() {
        return speed;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public void setColor(char color) {
        this.color = color;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

}