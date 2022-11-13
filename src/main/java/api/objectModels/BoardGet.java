package api.objectModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardGet extends BoardBaseObject {
    private String id;
    private BoardPrefs prefs;

    public String getId() {
        return id;
    }

    public BoardPrefs getPrefs() {
        return prefs;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class BoardPrefs {
        private String permissionLevel;

        public String getPermissionLevel() {
            return permissionLevel;
        }
    }
}
