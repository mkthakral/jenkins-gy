import com.gy.gitClone2

def call(Map params) {
    def builder = new gitClone2();
    builder.cloneRepository(params.branch, params.repoURL);
  }