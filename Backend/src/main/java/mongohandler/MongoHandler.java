package mongohandler;

import beans.AccountID;
import beans.Profile;
import beans.Team;
import beans.TeamID;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

/**
 * Created by nick on 10/1/16.
 */
public class MongoHandler implements MongoOperator {

    public MongoClient client;
    public MongoDatabase database;

    /**
     * Defining the constructors for the client
     */
    public MongoHandler() {
        client = new MongoClient();
        client.getDatabase(MongoConstants.DATABASE_NAME);
    }

    public MongoHandler(String hostname) {
        client = new MongoClient(hostname);
        client.getDatabase(MongoConstants.DATABASE_NAME);
    }

    public MongoHandler(String hostname, int port) {
        client = new MongoClient(hostname, port);
        client.getDatabase(MongoConstants.DATABASE_NAME);
    }

    @Override
    public boolean exists(AccountID account) {
        return false;
    }

    @Override
    public void populateProfile(Profile profile) {

    }

    @Override
    public void populateTeam(Team team) {

    }

    @Override
    public Team getTeam(TeamID teamID) {
        return null;
    }

    @Override
    public void addTeamMember(Team team, Profile newTeamMember) {

    }
}