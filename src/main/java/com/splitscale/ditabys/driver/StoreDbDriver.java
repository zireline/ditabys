package com.splitscale.ditabys.driver;

import com.splitscale.ditabys.config.PropsLoader;

public class StoreDbDriver extends DatabaseDriver {

  public StoreDbDriver() {
    super(PropsLoader.loadProps("src/main/resources/dev-db.properties"));
  }

}
