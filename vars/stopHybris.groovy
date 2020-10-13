import com.gy.stopHybris

def call(Map params) {
    def builder = new stopHybris();
    builder.stopHybris(params.environment);
  }