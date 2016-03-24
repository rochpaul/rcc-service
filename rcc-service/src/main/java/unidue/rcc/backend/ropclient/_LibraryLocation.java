package unidue.rcc.backend.ropclient;

import java.util.List;

import org.apache.cayenne.PersistentObject;
import org.apache.cayenne.ValueHolder;
import org.apache.cayenne.util.PersistentObjectHolder;
import org.apache.cayenne.util.PersistentObjectList;

import unidue.rcc.backend.dto.LibraryLocation;



/**
 * A generated persistent class mapped as "LibraryLocation" Cayenne entity. It is a good idea to
 * avoid changing this class manually, since it will be overwritten next time code is
 * regenerated. If you need to make any customizations, put them in a subclass.
 */
public abstract class _LibraryLocation extends PersistentObject {

    public static final String DELETED_PROPERTY = "deleted";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String PHYSICAL_PROPERTY = "physical";
    public static final String CHILD_LOCATIONS_PROPERTY = "childLocations";
    public static final String PARENT_LOCATION_PROPERTY = "parentLocation";

    protected boolean deleted;
    protected Integer id;
    protected String name;
    protected boolean physical;
    protected List<LibraryLocation> childLocations;
    protected ValueHolder parentLocation;

    public boolean isDeleted() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "deleted", false);
        }

        return deleted;
    }
    public void setDeleted(boolean deleted) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "deleted", false);
        }

        Object oldValue = this.deleted;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "deleted", oldValue, deleted);
        }
        
        this.deleted = deleted;
    }

    public Integer getId() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "id", false);
        }

        return id;
    }
    public void setId(Integer id) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "id", false);
        }

        Object oldValue = this.id;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "id", oldValue, id);
        }
        
        this.id = id;
    }

    public String getName() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "name", false);
        }

        return name;
    }
    public void setName(String name) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "name", false);
        }

        Object oldValue = this.name;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "name", oldValue, name);
        }
        
        this.name = name;
    }

    public boolean isPhysical() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "physical", false);
        }

        return physical;
    }
    public void setPhysical(boolean physical) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "physical", false);
        }

        Object oldValue = this.physical;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "physical", oldValue, physical);
        }
        
        this.physical = physical;
    }

    public List<LibraryLocation> getChildLocations() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "childLocations", true);
        } else if (this.childLocations == null) {
        	this.childLocations = new PersistentObjectList(this, "childLocations");
		}

        return childLocations;
    }
    public void addToChildLocations(LibraryLocation object) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "childLocations", true);
        } else if (this.childLocations == null) {
        	this.childLocations = new PersistentObjectList(this, "childLocations");
		}

        this.childLocations.add(object);
    }
    public void removeFromChildLocations(LibraryLocation object) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "childLocations", true);
        } else if (this.childLocations == null) {
        	this.childLocations = new PersistentObjectList(this, "childLocations");
		}

        this.childLocations.remove(object);
    }

    public LibraryLocation getParentLocation() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentLocation", true);
        } else if (this.parentLocation == null) {
        	this.parentLocation = new PersistentObjectHolder(this, "parentLocation");
		}

        return (LibraryLocation) parentLocation.getValue();
    }
    public void setParentLocation(LibraryLocation parentLocation) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentLocation", true);
        } else if (this.parentLocation == null) {
        	this.parentLocation = new PersistentObjectHolder(this, "parentLocation");
		}

        // note how we notify ObjectContext of change BEFORE the object is actually
        // changed... this is needed to take a valid current snapshot
        Object oldValue = this.parentLocation.getValueDirectly();
        if (objectContext != null) {
        	objectContext.propertyChanged(this, "parentLocation", oldValue, parentLocation);
        }
        
        this.parentLocation.setValue(parentLocation);
    }

}
