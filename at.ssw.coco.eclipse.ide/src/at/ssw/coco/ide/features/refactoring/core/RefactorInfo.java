/*******************************************************************************
 * Copyright (C) 2011 Martin Preinfalk
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *******************************************************************************/

package at.ssw.coco.ide.features.refactoring.core;

import at.ssw.coco.ide.editor.ATGEditor;

/**
 * implements base class for Refactoring Info 
 * Data Transfer Object (DTO)
 * 
 * @author Martin Preinfalk <martin.preinfalk@students.jku.at>
 *
 */
public class RefactorInfo {

	/**
	 * ATG Editor
	 */
	protected ATGEditor atgEditor;

	/**
	 * Constructor
	 * @param atgEditor
	 */
	public RefactorInfo(ATGEditor atgEditor) {
		super();
		this.atgEditor = atgEditor;
	}

	/**
	 * Getter - ATG Editor
	 * @return atgEditor
	 */
	public ATGEditor getAtgEditor() {
		return atgEditor;
	}
}
