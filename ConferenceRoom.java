import java.util.*;

class Meeting {
    int start, end;
    String name;

    Meeting(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}

public class ConferenceRoom {
    public static void main(String[] args) {
        List<Meeting> meetings = Arrays.asList(
                new Meeting("Team Sync", 1, 3),
                new Meeting("Client Call", 2, 4),
                new Meeting("Project Review", 3, 5),
                new Meeting("HR Session", 0, 6),
                new Meeting("Tech Talk", 5, 7),
                new Meeting("Board Meeting", 8, 9)
        );

        scheduleMeetings(meetings);
    }

    static void scheduleMeetings(List<Meeting> meetings) {
        meetings.sort(Comparator.comparingInt(m -> m.end));

        List<Meeting> scheduled = new ArrayList<>();
        int lastEnd = -1;

        for (Meeting m : meetings) {
            if (m.start >= lastEnd) {
                scheduled.add(m);
                lastEnd = m.end;
            }
        }

        System.out.println("Optimal Meeting Schedule:");
        for (Meeting m : scheduled) {
            System.out.println(m.name + " (" + m.start + "–" + m.end + ")");
        }
        System.out.println("Total meetings scheduled: " + scheduled.size());
    }
}
