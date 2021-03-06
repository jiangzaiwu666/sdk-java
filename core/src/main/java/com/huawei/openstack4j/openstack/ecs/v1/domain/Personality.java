package com.huawei.openstack4j.openstack.ecs.v1.domain;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.common.utils.Base64;

@JsonRootName("server")
public class Personality implements ModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String path;
	private String contents;

	@java.beans.ConstructorProperties({ "path", "contents" })
	public Personality(String path, String contents) {
		this.path = path;
		this.contents = contents;
	}

	public Personality() {
	}

	public static PersonalityBuilder builder() {
		return new PersonalityBuilder();
	}

	public PersonalityBuilder toBuilder() {
		return new PersonalityBuilder().path(this.path).contents(this.contents);
	}

	public String getPath() {
		return this.path;
	}

	public String getContents() {
		return this.contents;
	}

	@Override
	public String toString() {
		return "Personality(path=" + this.getPath() + ", contents=" + this.getContents() + ")";
	}

	public static class PersonalityBuilder {
		private String path;
		private String contents;

		PersonalityBuilder() {
		}

		public PersonalityBuilder path(String path) {
			this.path = path;
			return this;
		}

		/**
		 * the original content (don't base64), 
		 * SDK will auto convert content to base64 format
		 * 
		 * @param contents
		 * @return
		 */
		public PersonalityBuilder contents(String contents) {
			this.contents = Base64.encode(contents);
			return this;
		}

		public Personality build() {
			return new Personality(path, contents);
		}

		@Override
		public String toString() {
			return "Personality.PersonalityBuilder(path=" + this.path + ", contents=" + this.contents + ")";
		}
	}
}
