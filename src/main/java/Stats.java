import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;


import java.io.File;
import java.io.IOException;


public class Stats {
    public static void testSomeMethod() throws IOException
    {
        int count = 0;
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        String localDir = System.getProperty("user.dir");
        Repository repo = builder.setGitDir(new File(localDir + File.separator + ".git")).setMustExist(true).build();
        Git git = new Git(repo);
        Iterable<RevCommit> revCommits;

        try {
            revCommits = git.log().call();
        } catch (GitAPIException e) {
            e.printStackTrace();
            return;
        }


        for (RevCommit rev : revCommits) {
            if(rev.getFullMessage().contains("Added")){
                count++;
            }
            //System.out.println(rev.getFullMessage());
        }
        System.out.println("Total \"Added\" statement: " + count);
    }
}
