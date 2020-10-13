import com.gy.stopHybris

def call(Map params) {
    def builder = new stopHybris2();
    builder.stopServer(params.environment);
  }