package jType1;

import java.util.ArrayList;
import java.util.List;

/**
 * The GunKit object is used to hold the various guns that are available to the player
 * throughout game.  
 * 
 * @author jmb66
 *
 */
public class GunKit 
{
	public GunKit()
	{ //Nothing to do here
	}
	
	/**
	 * Adds the Gun from the parameter to the GunKit.  If the gun is not a null value
	 * the location of the Gun in the List is returned.  Otherwise -1 is returned.
	 * 
	 * @param gun - the <code>Gun</code> to be added to the <code>GunKit</code>
	 * @return int - the location of gun in the <code>List</code> or -1 if gun is <code>null</code>
	 */
	public int addGun(Gun gun)
	{
		if(gun != null)
		{
			guns.add(gun);
			return (guns.size() - 1);
		}
		return -1;
	}
	
	/**
	 * Removes the <code>Gun</code> at location <code>i</code> of the <code>GunKit</code>.
	 * 
	 * @param i - the location of the <code>Gun</code> to remove
	 */
	public void removeGun(int i)
	{
		if(i>=0 && i<guns.size())
		{
			guns.remove(i);
		}
	}
	
	/**
	 * Removes the <code>Gun</code> that matches the <code>name</code> parameter.
	 * 
	 * @param name - the name of the <code>Gun</code> to be removed
	 */
	public void removeGun(String name)
	{
		if(name != null)
		{
			for(int i=0; i<guns.size(); i++)
			{
				Gun g = (Gun)guns.get(i);
				if(name.equals(g.getName()))
				{
					guns.remove(i);
				}
			}
		}
	}
	
	/**
	 * This returns the number of guns that are currently in the GunKit.
	 * 
	 * @return the number of guns in the GunKit
	 */
	public int getGunCount()
	{
		return guns.size();
	}
	
	/**
	 * This method will look through the list and return the Gun
	 * at location <code>i</code> if it is within the bounds of the
	 * ArrayList.  Otherwise <code>null</code> is returned.
	 * 
	 * @param i - int location of Gun to return
	 * @return the Gun at location i
	 */
	public Gun getGun(int i)
	{
		if(i>=0 && i<guns.size())
		{
			return (Gun) guns.get(i);
		}
		return null;
	}
	
	/**
	 * This method will search the names of the guns in the GunKit for a gun
	 * that matches the name given as the parameter.  If no Gun is found then
	 * a null value is returned.
	 * 
	 * @param name - the name of the gun to look for
	 * @return the Gun that matches the name given
	 */
	public Gun findGun(String name)
	{
		if(name != null)
		{
			for(int i=0; i<guns.size(); i++)
			{
				Gun g = (Gun)guns.get(i);
				if(name.equals(g.getName()))
				{
					return g;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * This will retrieved the gun in the ith location and set it to the current Gun.
	 * If the gun does not exist in the GunKit then a <code> null </code> value is
	 * returned.  If the gun is found then it is set to the selected gun.
	 * 
	 * @param i - the location of the gun to be set to the selected gun.
	 */
	public void setSelectedGun(int i)
	{
		Gun gun = getGun(i);
		if(gun != null)
		{
			selectedGun = gun;
		}
	}
	
	/**
	 * This will find the gun with the give <code> name </code> in the GunKit.
	 * If the gun does not exist in the GunKit then a <code> null </code> value is
	 * returned.  If the gun is found then it is set to the selected gun.
	 * 
	 * @param name - the name of the gun to look for
	 * @return the currently selected gun
	 */
	public Gun setSelectedGun(String name)
	{
		Gun gun = findGun(name);
		if(gun != null)
		{
			selectedGun = gun;
		}
		return selectedGun;
	}
	
	/**
	 * Set the <code>gun</code> from the parameter to the selected <code>Gun</code>.
	 * 
	 * @param gun - Gun to be set to the selected Gun
	 */
	public void setSelectedGun(Gun gun)
	{
		selectedGun = gun;
	}
	
	/**
	 * Returns the <code>Gun</code> that is currently the selected <code>Gun</code>.
	 * 
	 * @return the currently selected Gun
	 */
	public Gun getSelectedGun()
	{
		return selectedGun;
	}
	
	protected List guns = new ArrayList();
	protected Gun selectedGun = null;
}
