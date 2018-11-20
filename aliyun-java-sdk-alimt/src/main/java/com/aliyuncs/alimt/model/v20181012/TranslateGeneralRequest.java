/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TranslateGeneralRequest extends RpcAcsRequest<TranslateGeneralResponse> {
	
	public TranslateGeneralRequest() {
		super("alimt", "2018-10-12", "TranslateGeneral", "alimt");
	}

	private String sourceLanguage;

	private String sourceText;

	private String formatType;

	private String targetLanguage;

	public String getSourceLanguage() {
		return this.sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		if(sourceLanguage != null){
			putBodyParameter("SourceLanguage", sourceLanguage);
		}
	}

	public String getSourceText() {
		return this.sourceText;
	}

	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
		if(sourceText != null){
			putBodyParameter("SourceText", sourceText);
		}
	}

	public String getFormatType() {
		return this.formatType;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
		if(formatType != null){
			putBodyParameter("FormatType", formatType);
		}
	}

	public String getTargetLanguage() {
		return this.targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
		if(targetLanguage != null){
			putBodyParameter("TargetLanguage", targetLanguage);
		}
	}

	@Override
	public Class<TranslateGeneralResponse> getResponseClass() {
		return TranslateGeneralResponse.class;
	}

}