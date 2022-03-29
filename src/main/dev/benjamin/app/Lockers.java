package main.dev.benjamin.app;

import java.util.ArrayList;

public class Lockers {

    public static void main(String[] args) {

        /*100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers. Next, he closes every second locker.
        Then, on his third pass, he toggles every third locker (closes it if it is open or opens it if it is closed).
        This process continues for 100 passes, such that on each pass 'i', the man toggles every 'i'th locker.
        After his 100th pass in the hallway, in which he toggles only locker #100, how many lockers are open?*/

        ArrayList<Integer> lockers = new ArrayList<>();

        int result = 0;

        int open = 0;
        int close = 1;

        int stepper = 2;

        for (int i = 0; i < 100; i++) {
            lockers.add(open);
        }

        for (int i = 0; i < lockers.size(); i++) {
            for (int x = 0; x < lockers.size(); x++) {
                if (x % stepper == 0) {
                    switch(lockers.get(x)) {
                        case 0:
                            lockers.set(x, close);
                            break;
                        case 1:
                            lockers.set(x, open);
                            break;
                    }
                }
            }
            stepper++;
        }

        for (int i = 0; i < lockers.size(); i++) {
            if (lockers.get(i) == 0) {
                result++;
            }
        }

        System.out.println("Lockers open after 100 cycles: " + result);

    }
}
