package fcu.selab.progedu.data;

import java.util.Date;

import org.json.JSONObject;

public class CommitStats {
  private Date commitTime;
  private int additions;
  private int deletions;

  public CommitStats(Date commitTime, int additions, int deletions) {
    this.commitTime = commitTime;
    this.additions = additions;
    this.deletions = deletions;
  }

  public JSONObject toJSON() {
    JSONObject object = new JSONObject();
    object.put("commitTime", commitTime);
    object.put("additions", additions);
    object.put("deletions", deletions);

    return object;
  }

}
