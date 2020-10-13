import com.gy.stopHybris2

def call(Map params) {
    def builder = new stopHybris2();
    builder.stopServer(params.environment);
  }