class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
//        robot.stepForward();

        int dirX = toX - robot.getX();
        int dirY = toY - robot.getY();

//        robot.getDirection();

        if (dirX > 0) {
            //to right
            switch (robot.getDirection().name()) {
                case "UP":
                    robot.turnRight();
                    break;
                case "LEFT":
                    robot.turnLeft();
                case "DOWN":
                    robot.turnLeft();
                    break;
                case "RIGHT":
                    break;
            }
        } else if (dirX < 0) {
            //to left
            switch (robot.getDirection().name()) {
                case "UP":
                    robot.turnLeft();
                    break;
                case "RIGHT":
                    robot.turnRight();
                case "DOWN":
                    robot.turnRight();
                    break;
                case "LEFT":
                    break;
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        // y:
        if (dirY > 0) {
            switch (robot.getDirection().name()) {
                case "LEFT":
                    robot.turnRight();
                    break;
                case "DOWN":
                    robot.turnLeft();
                case "RIGHT":
                    robot.turnLeft();
                    break;
                case "UP":
                    break;
            }
        } else if (dirY < 0) {
            switch (robot.getDirection().name()) {
                case "LEFT":
                    robot.turnLeft();
                    break;
                case "UP":
                    robot.turnRight();
                case "RIGHT":
                    robot.turnRight();
                    break;
                case "DOWN":
                    break;
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }

    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}