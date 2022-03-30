/*
 * Copyright 2022-Present Entando S.r.l. (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.entando.entando.plugins.jpcdsc.aps.storage;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.BiFunction;
import org.entando.entando.aps.system.services.storage.BasicFileAttributeView;
import org.entando.entando.aps.system.services.storage.IStorageManager;
import org.entando.entando.ent.exception.EntException;

/**
 * @author E.Santoboni
 */
public class RemoteStorageManager implements IStorageManager {
    
    
    private String baseURL;
	private String baseDiskRoot;
	private String protectedBaseDiskRoot;
	private String protectedBaseURL;
	private String allowedEditExtensions;

    
    /*
    public void saveFile(String subPath, boolean isProtectedResource, InputStream is) throws EntException, IOException;
	
	public boolean deleteFile(String subPath, boolean isProtectedResource) throws EntException;
	
	public void createDirectory(String subPath, boolean isProtectedResource) throws EntException;
	
	public void deleteDirectory(String subPath, boolean isProtectedResource) throws EntException;

	public InputStream getStream(String subPath, boolean isProtectedResource) throws EntException;
	
	public String getResourceUrl(String subPath, boolean isProtectedResource);
	
	public boolean exists(String subPath, boolean isProtectedResource) throws EntException;
	
	public BasicFileAttributeView getAttributes(String subPath, boolean isProtectedResource) throws EntException;
	
	public String[] list(String subPath, boolean isProtectedResource) throws EntException;
	
	public String[] listDirectory(String subPath, boolean isProtectedResource) throws EntException;
	
	public String[] listFile(String subPath, boolean isProtectedResource) throws EntException;
	
	public BasicFileAttributeView[] listAttributes(String subPath, boolean isProtectedResource) throws EntException;
	
	public BasicFileAttributeView[] listDirectoryAttributes(String subPath, boolean isProtectedResource) throws EntException;
	
	public BasicFileAttributeView[] listFileAttributes(String subPath, boolean isProtectedResource) throws EntException;
	
	public String readFile(String subPath, boolean isProtectedResource) throws EntException;
	
	public void editFile(String subPath, boolean isProtectedResource, InputStream is) throws EntException;

	public String createFullPath(String subPath, boolean isProtectedResource) throws EntException;

	public <T> T withValidResourcePath(String resourceRelativePath, boolean isProtectedResource,
									   BiFunction<String, String, T> bip);
    */
    
    
    
    
    
    
    @Override
    public void saveFile(String subPath, boolean isProtectedResource, InputStream is) throws EntException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteFile(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void createDirectory(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteDirectory(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public InputStream getStream(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getResourceUrl(String subPath, boolean isProtectedResource) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean exists(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasicFileAttributeView getAttributes(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] list(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] listDirectory(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] listFile(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasicFileAttributeView[] listAttributes(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasicFileAttributeView[] listDirectoryAttributes(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasicFileAttributeView[] listFileAttributes(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String readFile(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editFile(String subPath, boolean isProtectedResource, InputStream is) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String createFullPath(String subPath, boolean isProtectedResource) throws EntException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> T withValidResourcePath(String resourceRelativePath, boolean isProtectedResource,
									   BiFunction<String, String, T> bip) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
