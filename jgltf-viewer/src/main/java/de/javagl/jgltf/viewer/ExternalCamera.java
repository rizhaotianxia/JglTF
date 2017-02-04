/*
 * www.javagl.de - JglTF
 *
 * Copyright 2015-2016 Marco Hutter - http://www.javagl.de
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package de.javagl.jgltf.viewer;

import de.javagl.jgltf.impl.v1.Camera;

/**
 * An interface for an external camera. An instance of a class implementing
 * this interface may be passed to 
 * {@link AbstractGltfViewer#setExternalCamera(ExternalCamera)}, to allow
 * the camera of the viewer to be controlled externally, alternatively to
 * the {@link Camera}s that are provided by the glTF.
 */
public interface ExternalCamera
{
    /**
     * The view matrix of this camera, as a float array with 16 elements, 
     * representing the 4x4 matrix in column-major order.<br>
     * <br>
     * The returned matrix will not be stored or modified. So the supplier
     * may always return the same matrix instance.
     * 
     * @return The view matrix
     */
    float[] getViewMatrix();

    /**
     * The projection matrix of this camera, as a float array with 16 elements,
     * representing the 4x4 matrix in column-major order.<br>
     * <br>
     * The returned matrix will not be stored or modified. So the supplier
     * may always return the same matrix instance.
     * 
     * @return The projection matrix
     */
    float[] getProjectionMatrix();
}