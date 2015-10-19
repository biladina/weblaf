/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.demo.content.chooser.field;

import com.alee.demo.api.AbstractExample;
import com.alee.demo.api.AbstractStylePreview;
import com.alee.demo.api.FeatureState;
import com.alee.demo.api.Preview;
import com.alee.extended.colorchooser.WebColorChooserField;
import com.alee.managers.style.StyleId;
import com.alee.utils.CollectionUtils;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author Mikle Garin
 */

public class ColorChooserFieldExample extends AbstractExample
{
    @Override
    public String getId ()
    {
        return "colorchooserfield";
    }

    @Override
    protected List<Preview> createPreviews ()
    {
        final ColorChooserField e1 = new ColorChooserField ( StyleId.textfield );
        return CollectionUtils.<Preview>asList ( e1 );
    }

    /**
     * Color chooser field preview.
     */
    protected class ColorChooserField extends AbstractStylePreview
    {
        /**
         * Constructs new style preview.
         *
         * @param id preview style ID
         */
        public ColorChooserField ( final StyleId id )
        {
            super ( ColorChooserFieldExample.this, "basic", FeatureState.updated, id );
        }

        @Override
        protected JComponent createPreviewContent ( final StyleId id )
        {
            return new WebColorChooserField ( Color.RED );
        }
    }
}