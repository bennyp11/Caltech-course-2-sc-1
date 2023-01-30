import java.util.ArrayList;
import java.util.List;

public class Batch {
  private List<Participant> participants;
  private String time;

  public Batch(String time) {
    this.participants = new ArrayList<>();
    this.time = time;
  }

  public void addParticipant(Participant participant) {
    participants.add(participant);
  }

  public List<Participant> getParticipants() {
    return participants;
  }

  public String getTime() {
    return time;
  }
}