package unidue.rcc.backend.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

import unidue.rcc.backend.ropclient._LibraryLocation;

/**
 * 
 * @author Nils Verheyen - Last modified at 24.03.26
 *
 */
public class LibraryLocation extends _LibraryLocation {

    private static final long serialVersionUID = 1L;

    @JsonGetter
    public Integer getId() {
        return (getObjectId() != null && !getObjectId().isTemporary())
                ? (Integer) getObjectId().getIdSnapshot().get(ID_PROPERTY)
                : null;
    }

    public boolean hasChildren() {
        List<LibraryLocation> childLocations = getChildLocations();
        return childLocations != null && !childLocations.isEmpty();
    }

    @JsonGetter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LibraryLocation))
            return false;

        LibraryLocation other = (LibraryLocation) obj;
        return objectId.equals(other.objectId);
    }

    @Override
    public int hashCode() {
        return objectId.hashCode();
    }

//    @Override
//    public void accept(CollectionVisitor visitor) {
//        visitor.visit(this);
//    }
}