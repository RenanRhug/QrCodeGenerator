package com.renanrhug.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String filename, String contentType);
}
